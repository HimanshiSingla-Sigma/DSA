class Solution {
    public String simplifyPath(String path) {
        Deque<String> st = new ArrayDeque<>();

        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.isEmpty() || part.equals(".")) {
                continue;
            }

            if (part.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(part);
            }
        }

        List<String> dirs = new ArrayList<>();

        while (!st.isEmpty()) {
            dirs.add(st.removeLast());
        }

        return "/" + String.join("/", dirs);

    }
}