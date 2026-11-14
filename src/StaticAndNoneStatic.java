class StaticAndNoneStatic {
    /**
     * - static is belonged to class
     * + cannot create object,
     * + Classname.method()
     * + using this => NO
     * + Use it in the case general Const
     * - no-static is belonged to object
     * + need to create object from static context
     * + object.method()
     * + using this => YES
     * + Use it in the case data and behaviors of the object
     */
    void main(String[] args) {

        StaticAndNoneStatic jobmain = new StaticAndNoneStatic();

        int a = 30;
        int b = 30;
        int c = jobmain.sum(a, b);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}