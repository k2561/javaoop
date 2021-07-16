package chop5;

/**
 *
 */
class StaticCodeBlock {
    static String name = "defname";
    static {
        name = "staticname";
        System.out.println("execute static code block");
    }

    public StaticCodeBlock() {
        System.out.println("execute constructor");
    }
}

public class TestStaticCodeBlock {
    static {
        System.out.println("execute static code block in Test");
    }

    public static void main(String[] args) {
        System.out.println("execute main()");
        new StaticCodeBlock();
        new StaticCodeBlock();
        new StaticCodeBlock();
    }
}

