public class Main {
    public static void main(String[] args) {

        String dia = "Sabado.";

        String tipoDeDia = switch (dia) {
            case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> "Dia útil";
            case "Sabado", "Domingo" -> "Fim de semana";
            default -> "Desconhecido";
        };

        System.out.println(tipoDeDia);
    }
}
