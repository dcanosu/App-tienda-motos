import jakarta.persistence.Column;

@Entity
@Setter
@Getter
@Builer
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "motos")
public class Moto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String marca;
    String modelo;
    String placa;
    @Column(name = "cliente_id")
    Long fk_cliente_id;
}
