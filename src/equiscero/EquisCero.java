package equiscero;

import javax.swing.JOptionPane;

public class EquisCero {

    public static void main(String[] args) {
        String matriz[][] = new String[3][3];
        int contador = 0, turno = 1, opcion;
        String salida;

        for (int fila = 0; fila < 3; fila += 1) {
            for (int columna = 0; columna < 3; columna += 1) {
                contador += 1;
                matriz[fila][columna] = "" + contador;
            }
        }

        while (turno <= 9) {
            if (turno % 2 == 1) {//Turno del Jugador que tiene la x
                salida = "";

                for (String fila[] : matriz) {
                    for (String data : fila) {
                        salida += data + " ";
                    }
                    salida += "\n";
                }
                do {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea Jugador X\n" + salida));
                    if ((opcion < 1 || opcion > 9)) {
                        JOptionPane.showMessageDialog(null, "Esa es una opcion invalida");
                    } else if (matriz[(opcion - 1) / 3][(opcion - 1) % 3].equals("X") || matriz[(opcion - 1) / 3][(opcion - 1) % 3].equals("0")) {
                        JOptionPane.showMessageDialog(null, "Esa posicion ya esta ocupada");
                    }
                    System.out.println(opcion);
                } while (opcion < 1 || opcion > 9 || matriz[(opcion - 1) / 3][(opcion - 1) % 3].equals("X") || matriz[(opcion - 1) / 3][(opcion - 1) % 3].equals("0"));

                matriz[(opcion - 1) / 3][(opcion - 1) % 3] = "X";
                turno += 1;
                if ((matriz[0][0].equals("X") && matriz[0][1].equals("X") && matriz[0][2].equals("X")) || (matriz[1][0].equals("X") && matriz[1][1].equals("X") && matriz[1][2].equals("X"))
                        || (matriz[2][0].equals("X") && matriz[2][1].equals("X") && matriz[2][2].equals("X")) || (matriz[0][0].equals("X") && matriz[1][0].equals("X") && matriz[2][0].equals("X"))
                        || (matriz[0][1].equals("X") && matriz[1][1].equals("X") && matriz[2][1].equals("X")) || (matriz[0][2].equals("X") && matriz[1][2].equals("X") && matriz[2][2].equals("X"))
                        || (matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X")) || (matriz[0][2].equals("X") && matriz[1][1].equals("X") && matriz[2][0].equals("X"))) {
                    JOptionPane.showMessageDialog(null, "Felicidades Gana el Jugador X");
                    turno = 10;
                }

            } else {//Jugador 0

                salida = "";

                for (String fila[] : matriz) {
                    for (String data : fila) {
                        salida += data + " ";
                    }
                    salida += "\n";
                }
                do {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea Jugador 0\n" + salida));
                    if ((opcion < 1 || opcion > 9)) {
                        JOptionPane.showMessageDialog(null, "Esa es una opcion invalida");
                    } else if (matriz[(opcion - 1) / 3][(opcion - 1) % 3].equals("X") || matriz[(opcion - 1) / 3][(opcion - 1) % 3].equals("0")) {
                        JOptionPane.showMessageDialog(null, "Esa posicion ya esta ocupada");
                    }
                } while ((opcion < 1 || opcion > 9) || matriz[(opcion - 1) / 3][(opcion - 1) % 3].equals("X") || matriz[(opcion - 1) / 3][(opcion - 1) % 3].equals("0"));

                matriz[(opcion - 1) / 3][(opcion - 1) % 3] = "0";
                turno += 1;
                if ((matriz[0][0].equals("0") && matriz[0][1].equals("0") && matriz[0][2].equals("0")) || (matriz[1][0].equals("0") && matriz[1][1].equals("0") && matriz[1][2].equals("0"))
                        || (matriz[2][0].equals("0") && matriz[2][1].equals("0") && matriz[2][2].equals("0")) || (matriz[0][0].equals("0") && matriz[1][0].equals("0") && matriz[2][0].equals("0"))
                        || (matriz[0][1].equals("0") && matriz[1][1].equals("0") && matriz[2][1].equals("0")) || (matriz[0][2].equals("0") && matriz[1][2].equals("0") && matriz[2][2].equals("0"))
                        || (matriz[0][0].equals("0") && matriz[1][1].equals("0") && matriz[2][2].equals("0")) || (matriz[0][2].equals("0") && matriz[1][1].equals("0") && matriz[2][0].equals("0"))) {
                    JOptionPane.showMessageDialog(null, "Felicidades Gana el Jugador 0");
                    turno = 10;
                }

            }

        }
    }

}
