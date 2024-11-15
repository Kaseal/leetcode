package medium.queue;

//649. Dota2 Senate (Medium)
public class Dota2Senate {

	//without queue
	public String predictPartyVictory(String senate) {

		class Processor {

			int next(char[] chars, int sp, char c) {
				int p = sp;
				do {
					p = p == chars.length - 1 ? 0 : p + 1;
					if (Character.isLetter(chars[p]) && p != sp) {
						if (chars[p] != c) {
							return p;
						}
					}
				} while (p != sp);

				return -1;
			}

			int next(char[] chars, int sc) {
				int p = sc;
				do {
					p = p == chars.length - 1 ? 0 : p + 1;
					if (Character.isLetter(chars[p]) && p != sc) {
						return p;
					}
				} while (p != sc);

				return -1;
			}

			String printResult(char senator) {
				if (senator == 'D') {
					return "Dire";
				} else {
					return "Radiant";
				}
			}

		}

		Processor processor = new Processor();

		char[] chars = senate.toCharArray();

		if (chars.length == 1) {
			return processor.printResult(chars[0]);
		}

		int sc = 0;
		int sp = 1;
		char lastSenator = chars[sc];
		while (sp != -1 && sc != -1) {
			lastSenator = chars[sc];
			if (chars[sc] == chars[sp]) {
				sp = processor.next(chars, sp, chars[sp]);
			} else {
				chars[sp] = '0';
				sc = processor.next(chars, sc);
				if (sc != -1) {
					sp = processor.next(chars, sp, chars[sc]);
				}
			}
		}

		return processor.printResult(lastSenator);
	}

}
