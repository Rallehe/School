public class Main {
    public static void main(String[] args) {
        RootUserLazy lazy = RootUserLazy.getInstance();
        System.out.println(lazy);

        RootUserPSF psf = RootUserPSF.instance;
        System.out.println(psf);

        RootUserEnum rEnum = RootUserEnum.INSTANCE;
        System.out.println(rEnum);
    }
}
