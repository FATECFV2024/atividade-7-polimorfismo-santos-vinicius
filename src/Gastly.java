// Brincadeirinha viu professor <3 

public class Gastly extends Eevee{
  public Gastly(){
    super("Fantasma", 1.3, 0.1, 30, "Tijolo");
  }

  @Override
  public String ataque(){
    return "Lambida";
  }

  @Override
  public String defesa(){
    return "Abismar"; // Astonish
  }

  @Override
  public String especial(){
    return "Bola Sombria";
  }
}
