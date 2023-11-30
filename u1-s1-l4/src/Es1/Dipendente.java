package Es1;

import java.util.Random;

public class Dipendente {
    private double stipendioBase;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private TipoLivello livello = TipoLivello.OPERAIO;
    private TipoDipartimento dipartimento;

    //GETTER
    public double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public TipoLivello getLivello() {
        return livello;
    }

    public TipoDipartimento getDipartimento() {
        return dipartimento;
    }

    //SETTER
    public void setDipartimento(TipoDipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    //COSTRUTTORI
    public Dipendente(int matricola, TipoDipartimento dipartimento) {
        Random rndm = new Random();
        this.matricola = rndm.nextInt(1, 10000);
        this.stipendio = stipendioBase;
        this.dipartimento = getDipartimento();
        this.importoOrarioStraordinario = 30;
        this.livello = TipoLivello.OPERAIO;
    }

    public Dipendente() {
    }

    ;

    public Dipendente(double stipendioBase, int matricola, double stipendio, double importoOrarioStraordinario, TipoLivello livello, TipoDipartimento dipartimento) {
        Random rndm = new Random();
        this.matricola = rndm.nextInt(1, 10000);
        this.stipendioBase = 1000;
        this.stipendio = stipendioBase;
        this.dipartimento = getDipartimento();
        this.importoOrarioStraordinario = rndm.nextInt(1, 100);
        this.livello = livello;

    }

    //METODI
    public void stampaDatiDipendente() {
        System.out.println("Matricola nr'" + this.matricola + ";" + "Stipendio:" + this.stipendio + ";" + "Livello:" + this.livello + ";" + "Dipartimento:" + dipartimento);
    }

    public void aggiornaLivello(TipoLivello livello) {
        switch (livello) {
            case OPERAIO:
                System.out.println("IMPIEGATO");
               stipendio = stipendioBase * 1.2;
                break;
            case IMPIEGATO:
                System.out.println("QUADRO");
                stipendio = stipendioBase * 1.5;
                break;
            case QUADRO:
                System.out.println("DIRIGENTE");
                stipendio = stipendioBase *2;

                break;
            case DIRIGENTE:
                System.err.println("Errore nell'aggiornamento");
                break;
        }
    }

    public void calcolaPaga(double stipendio){
        for()
    }
}

