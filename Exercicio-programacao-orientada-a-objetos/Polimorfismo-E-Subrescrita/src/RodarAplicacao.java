class RodarAplicacao{

public static void main(String[] args) {
    
    ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

    for (ClasseMae classe:classes){
        classe.metodo1();
    }

    System.out.println("null");

    ClasseFilha2 classeFilha2 = new ClasseFilha2();
    classeFilha2.metodo2();
}
}