package easy;

import java.util.ArrayList;
import java.util.List;

//1436. Destination City (Easy)
public class DestinationCity {

	public String destCity(List<List<String>> paths) {
		List<String> fromPaths = new ArrayList<>();
		List<String> destPaths = new ArrayList<>();
		for (List<String> path : paths) {
			fromPaths.add(path.get(0));
			destPaths.add(path.get(1));
		}

		for (String destPath : destPaths) {
			if (!fromPaths.contains(destPath)) {
				return destPath;
			}
		}

		return "";
	}

}
