select * 
from persona;

DELIMITER //
create procedure spTest(IN nombreParam varchar(50), IN passParam varchar(50))
BEGIN
	INSERT INTO persona (nombre,pass) values (nombreParam, PassParam);
    END //
DELIMITER ;

call spTest('Zoro',25);

select * from persona;

DELIMITER //
create procedure spListar()
BEGIN
	select * from persona;
    END //
DELIMITER ;

call spListar();

DELIMITER //
create procedure spSalidaID(IN nombreParam varchar(50), OUT idParam INT)
BEGIN
	select ID into idParam from persona where nombre = nombreParam;
    END //
DELIMITER ;