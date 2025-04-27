CREATE TABLE cargos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255)
);

CREATE TABLE empleados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE,
    cargo_id INT,
    FOREIGN KEY (cargo_id) REFERENCES cargos(id)
);

CREATE TABLE salarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    empleado_id INT,
    monto DECIMAL(10,2) NOT NULL,
    fecha_pago DATE NOT NULL,
    FOREIGN KEY (empleado_id) REFERENCES empleados(id)
);

CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    telefono VARCHAR(20),
    email VARCHAR(150) UNIQUE
);

CREATE TABLE motos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(100) NOT NULL,
    modelo VARCHAR(100) NOT NULL,
    placa VARCHAR(20) UNIQUE NOT NULL,
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);

CREATE TABLE servicios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255),
    precio DECIMAL(10,2) NOT NULL
);

CREATE TABLE servicio_moto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    moto_id INT,
    servicio_id INT,
    cargo_id INT,
    fecha_servicio DATE NOT NULL,
    comentarios VARCHAR(255),
    FOREIGN KEY (moto_id) REFERENCES motos(id),
    FOREIGN KEY (servicio_id) REFERENCES servicios(id)
    FOREIGN KEY (cargo_id) REFERENCES cargo_id(id)
);