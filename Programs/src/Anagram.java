import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
	public static void main(String args[]) {

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		if (strs.length == 0)
			return;
		Map<String, List> ans = new HashMap<String, List>();
		for (String s : strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if (!ans.containsKey(key))
				ans.put(key, new ArrayList());
			ans.get(key).add(s);

		}
		System.out.print(new ArrayList(ans.values()));
	}
}