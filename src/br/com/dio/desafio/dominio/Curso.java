package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

   private  int cargaHoraria;

   public Curso() {
      super();
   }


   public Curso(String titulo, String descricao, int cargaHoraria) {
      super(titulo, descricao);
      this.cargaHoraria = cargaHoraria;
   }

   public int getCargaHoraria() {
      return cargaHoraria;
   }

   public void setCargaHoraria(int cargaHoraria) {
      this.cargaHoraria = cargaHoraria;
   }

   @Override
   public double calcularXp() {
      return XP_PADRAO *cargaHoraria;
   }

   @Override
   public String toString() {
      return "\nCursos: " +
              "\ntitulo: " + getTitulo()+
              "\ndescricao: " + getDescricao() +
              "\ncargaHoraria: " + cargaHoraria ;
   }
}
