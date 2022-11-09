package finalKeyword;

public final class FinalKeyword {
    final int i=10;                        //constant

//    public FinalKeyword(){                  //constructor
//        i = 13;
//    }

    public final void display(){
        int  i = 12;

    }

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        obj.display();
        System.out.println(obj.i);


    }

}



/**
 *  final variable = it used for declare statement.
 *  final method = if you declare method as final then you cannot override this method .
 *  final class = if you declare final class then it cannot  inherit
 *
 */