package org.shashank.dump;

public class Apple {

    static{
        System.out.println("I am in static-A");
    }

    {
        System.out.println("I am in non-static A");
    }

    public Integer m1(){
        return 1;
    }


    private static class SubApple extends Apple{

        static{
            System.out.println("I am in static-B");
        }

        {
            System.out.println("I am in non-static B");
        }

        public Integer m1(){
            return 2;
        }

    }

}
