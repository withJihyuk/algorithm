select animal_id, name, If(sex_upon_intake like "%Neutered%" or sex_upon_intake like "%Spayed%", "O", "X") as '중성화'
from animal_ins
order by animal_id