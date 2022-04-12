use EstrelaDaMorte;

select * from Pilotos;
select * from Planetas;
select * from Naves;
select * from PilotosNaves;
select * from HistoricoViagens;


select * from Pilotos where Nome = ltrim(' Darth Vader');

select * from Pilotos where Nome like 'Dart%';

select * from Pilotos where Nome like '%Vader';

select * from Pilotos where Nome like '%l%';


insert HistoricoViagens (IdNave, IdPiloto, DtSaida)
values (1,1, GETDATE());

select * from HistoricoViagens;



select t1.*,
	   t2.Nome,
	   t3.Nome
from HistoricoViagens t1
inner join Pilotos t2
on t1.IdPiloto = t2.IdPiloto
inner join Naves t3
on t1.IdNave = t3.IdNave;

select case 
		when count(DtSaida) <> count(DtChegada) then 1 
		else 0 
		end Viajando,
		count(DtSaida),
		count(DtChegada)
from HistoricoViagens 
where IdPiloto = 14;

select * from PilotosNaves;

select * from HistoricoViagens;


select * from PilotosNaves where IdPiloto = 14 and IdNave = 10;

delete from PilotosNaves where IdPiloto = 14 and IdNave = 10;


