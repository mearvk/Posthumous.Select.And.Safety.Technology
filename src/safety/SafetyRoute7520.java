package safety;

public class SafetyRoute7520
{
    public String images = "::; ,causes.aways.252.a.b.ac ;; ac";

    public SafetyRoute7520()
    {
        this.iterate();
    }

    public void iterate()
    {
        Lesson one = new Lesson("");

        Lesson two = new Lesson("");

        Lesson three = new Lesson("");

        Lesson four = new Lesson("");

        Lesson five = new Lesson("");

        one.choice();

        two.choice();

        three.choice();

        four.choice();

        five.choice();
    }

    public static class Lesson
    {
        public Motion one;

        public Motion two;

        public Motion three;

        public Motion four;

        public Motion five;

        public Lesson(final String modifier)
        {
            System.out.println("Motions: are alightedght; and are causes.");
        }

        public void choice()
        {
            System.currentTimeMillis();

            System.out.println(">> "+this.one.toString());
        }

        public static class Motion
        {
            public String motion001;

            public String motion002;

            public String motion003;

            public String motion004;

            public String motion005;
        }
    }
}

