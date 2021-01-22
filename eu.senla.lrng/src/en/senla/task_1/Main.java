package en.senla.task_1;

public class Main {

        static byte aByte;
        static short bShort;
        static int cInt;
        static long dLong;
        static float eFloat;
        static double fDouble;
        static char gChar;

        static Byte wByte;
        static Short wShort;
        static Integer wInt;
        static Long wLong;
        static Float wFloat;
        static Double wDouble;
        static String wString;
        static Character wChar;
        static Boolean wBoolean;

    public static void main(String[] args) {
        Number number = new Number();

        number.setaByte((byte) 111);
        System.out.println(number.getaByte());

        number.setbShort((short) 43254);
        System.out.println(number.getbShort());

        number.setcInt(1111112423); // (int) при указание типа, пишет что убыточный
        System.out.println(number.getcInt());

        number.setdLong((long) 922337685477580L );// (long) при указание типа, пишет что убыточный
        System.out.println(number.getdLong());

        number.seteFloat((float) 3436782342.32);
        System.out.println(number.geteFloat());

        number.setfDouble((double) 276400.1225);
        System.out.println(number.getfDouble());

        number.setgChar((char) 'a');
        System.out.println(number.getgChar());

        number.setaBoolean((boolean) false );
        System.out.println(number.isaBoolean());



        number.setwByte((byte) 11);
        System.out.println("wrapbyte:"+ number.getwByte());

        number.setwShort((short) 23444);
        System.out.println("wrapshort:"+ number.getwShort());

        number.setwInt((Integer) 23124244);
        System.out.println("wrapint:"+ number.getwInt());

        number.setwLong((Long) 23124244234L);
        System.out.println("wraplong:"+number.getwLong());

        number.setwFloat((float) 24324324);
        System.out.println("wrapfloat:"+number.getwFloat());

        number.setwDouble((Double) 34.234);
        System.out.println("wrapdouble:"+number.getwDouble());

        number.setwString((String) "dadadassda fsddsf ");
        System.out.println("wrapstring:"+number.getwString());

        number.setwChar((Character) 'A');
        System.out.println("wrapchar:"+number.getwChar());

        number.setwBoolean((Boolean) true);
        System.out.println("wrapbool:"+number.getwBoolean());



        //aByte =130; need type int;
        System.out.println(aByte);
        //short w = number.getdLong();
        //System.out.println(w); // can't set value with 64bits set 16bits
        //int z = "dasasd";
        //System.out.println(z);

        float v = number.geteFloat();
        System.out.println(v);


       // char b= number.isaBoolean(); only boolean type
        //System.out.println(b);

        String x1= "test";
        String x2= new String("test" );

        System.out.println(x1.equals(x2));

        System.out.println(x1 == x2);

        Integer  c1 = 122;
        int x3= 122;

        System.out.println(c1 == x3);





        String r = "bull";
        Character c = 'd';

    }
}
