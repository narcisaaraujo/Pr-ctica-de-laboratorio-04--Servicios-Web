package ec.edu.ups.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PedidoDetalle
 *
 */
@Entity

public class PedidoDetalle implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int cantidad;
	private float total;
	
	@ManyToOne
	@JoinColumn
	private PedidoCabecera pedidoCabecera;
	
	
	@ManyToOne
	@JoinColumn
	private Bodega pedidoBodega;
	
	@ManyToOne
	@JoinColumn
	private Producto producto;

	public PedidoDetalle() {
		super();
	}
	
	public PedidoDetalle(int id, int cantidad, float total, PedidoCabecera pedidoCabecera, Producto producto) {
		this.setId(id);
		this.setCantidad(cantidad);
		this.setTotal(total);
		this.setPedidoCabecera(pedidoCabecera);
		this.setProducto(producto);
	}
	
	public PedidoDetalle(int id, int cantidad, float total, Producto producto) {
		this.setId(id);
		this.setCantidad(cantidad);
		this.setTotal(total);
		this.setProducto(producto);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getTotal() {
		return total;
	}
	
	public float calcularTotal(float cantidad, float precio) {
		return cantidad*precio;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public PedidoCabecera getPedidoCabecera() {
		return pedidoCabecera;
	}

	public void setPedidoCabecera(PedidoCabecera pedidoCabecera) {
		this.pedidoCabecera = pedidoCabecera;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Bodega getPedidoBodega() {
		return pedidoBodega;
	}

	public void setPedidoBodega(Bodega pedidoBodega) {
		this.pedidoBodega = pedidoBodega;
	}

	@Override
	public String toString() {
		return "PedidoDetalle [id=" + id + ", cantidad=" + cantidad + ", total=" + total + ", pedidoCabecera="
				+ pedidoCabecera + ", pedidoBodega=" + pedidoBodega + ", producto=" + producto + "]";
	}
	
	
	
}