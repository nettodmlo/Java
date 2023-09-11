public class Aluno extends Pessoa {

    private double notaUm;
    private double notaDois;
    private double mediaGeral;

    public double getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(double notaUm) {
        this.notaUm = notaUm;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(double notaDois) {
        this.notaDois = notaDois;
    }

    public double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
        }

    public double fazerMedia( ) {
        mediaGeral = (notaUm + notaDois) / 2;
        return mediaGeral;
        }
    public void infosAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Primeira nota: " + notaUm);
        System.out.println("Segunda nota: " + notaDois);
        System.out.println("Média geral: " + fazerMedia());
        System.out.println("Cadastrado com sucesso!!!");
    }
    }
