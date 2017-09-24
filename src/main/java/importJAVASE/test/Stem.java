package importJAVASE.test;


class ComponentSub1 extends Component1{
    ComponentSub1(){
        System.out.println("Component1()");
    }
}

class ComponentSub2 extends Component2{
    ComponentSub2(){
        System.out.println("Component2()");
    }
}

class ComponentSub3 extends Component3{
    ComponentSub3(){
        System.out.println("Component3()");
    }
}

public class Stem extends Chess{
    Stem(){
        super();
        System.out.println("Stem()");
    }

    public static void main(String args[]){

        new Stem();
    }

}
