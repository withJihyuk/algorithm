select USER_ID, product_id 
from online_sale
group by user_id, product_id
having count(product_id) > 1 
order by user_id asc, product_id desc ;