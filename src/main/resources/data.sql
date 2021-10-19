DROP TABLE IF EXISTS tipocambio;

CREATE TABLE tipocambio (
  id INTEGER AUTO_INCREMENT  PRIMARY KEY,
  moneda_origen VARCHAR(3) NOT NULL,
  moneda_destino VARCHAR(3) NOT NULL,
  valor DECIMAL DEFAULT NULL
);

INSERT INTO tipocambio (id, moneda_origen, moneda_destino, valor) VALUES
  (1, 'SOL', 'SOL', 1.00),
  (2, 'SOL', 'DOL', 4.00),
  (3, 'SOL', 'EUR', 4.00);
