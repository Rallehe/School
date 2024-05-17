public enum RootUserEnum {
    INSTANCE;
    private static final int UID = 0;
    private static final int GID = 0;
    private static final String userName = "root";
    private static final String name = "Super user";
    private static final String home = "/root";
    private static final String shell = "/bin/sh";

    public String toString() {
        return new StringBuilder(userName)
                .append("(").append(name).append(")")
                .append(" ").append(UID).append(":").append(GID)
                .append(" home: ").append(home).append(" ")
                .append("shell: ").append(shell)
                .toString();
    }
}
