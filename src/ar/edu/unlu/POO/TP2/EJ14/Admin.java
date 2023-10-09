package ar.edu.unlu.POO.TP2.EJ14;


import java.util.ArrayList;

public class Admin {
    private static ArrayList<Ventas> totalVentas = new ArrayList<>();
    private PaqueteTurismo viaje;
    private Cliente cliente;
    private ArrayList<PaqueteTurismo> viajes = new ArrayList<>();


    public PaqueteTurismo nuevo_viaje(Transporte t, Hospedaje h, Guia g){
        viaje = new PaqueteTurismo(t, h, g);
        viajes.add(viaje);
        return viaje;
    }

    public void mostrar_viajes(){
        System.out.println("\t\t ** VIAJES **\n");
        System.out.println("\tID  GUIA  TRANSPORTE  HOSPEDAJE  PRECIO\n");
        for(int i=0; i<viajes.size(); i++){
            viaje = viajes.get(i);
            System.out.printf("\t* %d %s %s  %s %.2f\n", viaje.getId_paquete(), viaje.getGuia(), viaje.getTransporte(), viaje.getHospedaje(), viaje.precioPaquete());
        }
    }

    public void vender_viaje(Cliente cliente, PaqueteTurismo paquete){
        for(int i=0; i<viajes.size(); i++){
            viaje = viajes.get(i);
            if(viaje.equals(paquete)){
                viaje.sumar_venta();
                Ventas nueva_venta = new Ventas(cliente, viaje);
                totalVentas.add(nueva_venta);
                cliente.comproPaquete(viaje);
            }
        }
    }

    public void viaje_mas_vendidos(){
        int n=0, id=0;
        String guia = "";
        for (int i=0; i<viajes.size(); i++){
            viaje = viajes.get(i);
            if(viaje.getCantidad_ventas() > n){
                n = viaje.getCantidad_ventas();
                id = viaje.getId_paquete();
                guia = viaje.getGuia();
            }
        }
        System.out.printf("\nEl viaje mas vendido es (id): '%s', guiado por %s. Con %d ventas.", id, guia, n);
    }

    public void total_ventas(){
        System.out.println("TOTAL VENTAS\n");
        System.out.println("ID \t NOMBRE\t ID VIAJE \t GUIA \t HOTEL \t  TRANSPORTE");
        for (int i=0; i<totalVentas.size(); i++){
            Ventas ventas = totalVentas.get(i);
            viaje = ventas.getPaqueteTurismo();
            cliente = ventas.getCliente();
            System.out.printf("-%d\t %s \t  %d \t  %s  \t %s \t   %s\n", cliente.getId_cliente(), cliente.getNombre(), viaje.getId_paquete(), viaje.getGuia(), viaje.getHospedaje(), viaje.getTransporte());
        }
    }
}
