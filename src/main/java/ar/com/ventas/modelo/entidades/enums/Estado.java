package ar.com.ventas.modelo.entidades.enums;

public enum Estado {
  /**
     * Estado para registros pendientes de modificación
     */
    ABIERTA(1, "Abierta"),
    /**
     * Estado para registros finalizados
     */
    FINALIZADA(2, "Finalizada"),
    /**
     * Estado para registros cancelados durante el proceso
     */
    CANCELADA(3, "Cancelada");

    private final int ID;
    private final String DESCRIPCION;

    private Estado(int id, String descripcion) {
        this.ID = id;
        this.DESCRIPCION = descripcion;
    }

    /**
     * Devuelve el código del estado
     *
     * @return int id
     */
    public int getId() {
        return ID;
    }

    @Override
    public String toString() {
        return this.DESCRIPCION;
    }
}
