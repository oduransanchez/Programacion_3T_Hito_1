-- Crear la base de datos si aún no existe
CREATE DATABASE IF NOT EXISTS test;
USE test;

-- Crear la tabla 'productos'
CREATE TABLE IF NOT EXISTS productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    precio DECIMAL(8,2),
    fecha DATE
);
