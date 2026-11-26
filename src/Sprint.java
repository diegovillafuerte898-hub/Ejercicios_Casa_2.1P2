import java.util.ArrayList;

public class Sprint {
    private ArrayList<Tarea> tareas;

    public Sprint() {
        this.tareas = new ArrayList<>();
    }

    public void crearTarea(String codigo, String titulo, double horas) {
        tareas.add(new Tarea(codigo, titulo, horas));
    }

    public Tarea buscarTarea(String codigo) {
        for (Tarea t : tareas) {
            if (t.getCodigo().equals(codigo)) return t;
        }
        return null;
    }

    public void completarTarea(String codigo) {
        Tarea t = buscarTarea(codigo);
        if (t != null) t.setCompletada(true);
    }

    public int contarCompletadas() {
        int c = 0;
        for (Tarea t : tareas) {
            if (t.isCompletada()) c++;
        }
        return c;
    }

    public double calcularHorasPendientes() {
        double total = 0;
        for (Tarea t : tareas) {
            if (!t.isCompletada()) total += t.getHoras();
        }
        return total;
    }

    public String mostrarTareas() {
        String res = "";
        for (Tarea t : tareas) {
            res += t.mostrarInformacion() + "\n";
        }
        return res;
    }
}