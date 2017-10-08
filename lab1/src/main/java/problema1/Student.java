package problema1;

import java.io.*;
import java.time.Year;
import java.util.List;

public class Student {
    private String nume;
    private String prenume;
    private String idnp;
    private Year promotia;
    private String grupa;
    private Double notaAnalizaMatematica;
    private Double notaProgramareC;
    private Double notaAlgoritmica;
    private Double notaBazeleInformaticii;
    private Double notaEngleza;
    private Double mediaGenerala;
    private Integer crediteObtinute;

    public Student(String nume, String prenume, String idnp, Year promotia, String grupa, Double notaAnalizaMatematica, Double notaProgramareC, Double notaAlgoritmica, Double notaBazeleInformaticii, Double notaEngleza) {
        if (isNotValidMark(notaAlgoritmica) || isNotValidMark(notaAnalizaMatematica)
                || isNotValidMark(notaProgramareC) || isNotValidMark(notaBazeleInformaticii) || isNotValidMark(notaEngleza)) {
            throw new IllegalArgumentException("Nota poate fi doar de la 1 pana la 10");
        }
        this.nume = nume;
        this.prenume = prenume;
        this.idnp = idnp;
        this.promotia = promotia;
        this.grupa = grupa;
        this.notaAnalizaMatematica = notaAnalizaMatematica;
        this.notaProgramareC = notaProgramareC;
        this.notaAlgoritmica = notaAlgoritmica;
        this.notaBazeleInformaticii = notaBazeleInformaticii;
        this.notaEngleza = notaEngleza;
        this.mediaGenerala = notaAnalizaMatematica + notaProgramareC + notaAlgoritmica + notaBazeleInformaticii + notaEngleza / 5;
        int credite = 0;
        credite += notaAnalizaMatematica >= 5 ? 6 : 0;
        credite += notaProgramareC >= 5 ? 6 : 0;
        credite += notaAlgoritmica >= 5 ? 6 : 0;
        credite += notaBazeleInformaticii >= 5 ? 6 : 0;
        credite += notaEngleza >= 5 ? 6 : 0;
        this.crediteObtinute = credite;
    }

    private boolean isNotValidMark(Double nota) {
        return (nota < 1 || nota > 10);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getIdnp() {
        return idnp;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public Year getPromotia() {
        return promotia;
    }

    public void setPromotia(Year promotia) {
        this.promotia = promotia;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public Double getNotaAnalizaMatematica() {
        return notaAnalizaMatematica;
    }

    public void setNotaAnalizaMatematica(Double notaAnalizaMatematica) {
        this.notaAnalizaMatematica = notaAnalizaMatematica;
    }

    public Double getNotaProgramareC() {
        return notaProgramareC;
    }

    public void setNotaProgramareC(Double notaProgramareC) {
        this.notaProgramareC = notaProgramareC;
    }

    public Double getNotaAlgoritmica() {
        return notaAlgoritmica;
    }

    public void setNotaAlgoritmica(Double notaAlgoritmica) {
        this.notaAlgoritmica = notaAlgoritmica;
    }

    public Double getNotaBazeleInformaticii() {
        return notaBazeleInformaticii;
    }

    public void setNotaBazeleInformaticii(Double notaBazeleInformaticii) {
        this.notaBazeleInformaticii = notaBazeleInformaticii;
    }

    public Double getNotaEngleza() {
        return notaEngleza;
    }

    public void setNotaEngleza(Double notaEngleza) {
        this.notaEngleza = notaEngleza;
    }

    public Double getMediaGenerala() {
        return mediaGenerala;
    }

    public void setMediaGenerala(Double mediaGenerala) {
        this.mediaGenerala = mediaGenerala;
    }

    public int getCrediteObtinute() {
        return crediteObtinute;
    }

    public void setCrediteObtinute(int crediteObtinute) {
        this.crediteObtinute = crediteObtinute;
    }

    @Override
    public String toString() {
        return "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", mediaGenerala=" + mediaGenerala +
                ", crediteObtinute=" + crediteObtinute;
    }

    public static void salveazaInFisier(File file, List<Student> students) throws IOException {
        if (file == null || students == null) {
            throw new IllegalArgumentException("Argumentul nu poate fi nul");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file.getName());
        for (Student s : students) {
            fileOutputStream.write(s.toString().getBytes());
            fileOutputStream.write(System.lineSeparator().getBytes());
        }
        fileOutputStream.close();
    }
}
