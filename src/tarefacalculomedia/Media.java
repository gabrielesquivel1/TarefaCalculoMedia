package tarefacalculomedia;

import java.util.Scanner;

/**
 * @author GEsquivel$
 * Created on 19/08/2023$
 */
public class Media {

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double media;

    public Media (){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        setNota1(scan.nextDouble());
        System.out.print("Digite a segunda nota: ");
        setNota2(scan.nextDouble());
        System.out.print("Digite a terceira nota: ");
        setNota3(scan.nextDouble());
        System.out.print("Digite a quarta nota: ");
        setNota4(scan.nextDouble());
        System.out.println("A média é: " + this.getMedia());
    }


    public double getMedia() {
        return(nota1 + nota2 + nota3 + nota4) / 4;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
}
