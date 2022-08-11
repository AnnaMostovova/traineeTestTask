select ((SELECT count(*) from orders where promocode_id is NULL) / count(*))
from orders