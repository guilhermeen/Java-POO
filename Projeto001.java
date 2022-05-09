package projeto001;
public class Projeto001 {
    public static void main(String[] args) {
        Video v[]= new Video[3]; // Define quntidades de videos
        v[0]=new Video("Aula 01 de POO"); // Chama o metodo construtor da classe Video para o index 0
        v[1]=new Video("Aula 02 de JAVA"); // Chama o metodo construtor da classe Video para o index 1
        v[2]=new Video("Aula 03 de Python");// Chama o metodo construtor da classe Video para o index 2
    
        Estudante e[] =new Estudante[2]; // Define num de estudantes
        g[0]= new Estudante("Guilherme",21,"M","Guiga"); // Entrega os parametros para o index o
        g[1]= new Estudante("Juliana",25,"F","Juju"); // Entrega os parametros para o index 1
        
        Visualizacao vis [] = new Visualizacao[5]; // Define espectador, visualizacoes, total de views e historico 
        vis[0] = new Visualizacao(g[0],v[2]); //Guilherme assiste video de index 2(Python)
        vis[0].avaliar(); // Avalia com nota 5 o video de index 2
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0],v[1]); //Guilherme assiste video de index 1(JAVA)
        vis[0].avaliar(35.0f);// Avalia com nota 5 utilizando porcentagem o video de index 1
        System.out.println(vis[0].toString());
        
        
        System.out.println("VIDEOS\n--------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nESTUDANTES\n---------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
    }
}
