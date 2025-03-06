# select emp_no, sum(score)
# from hr_grade
# group by emp_no
# order by sum(score) desc
# limit 1

select a.score, a.emp_no, emp_name, position, email
from hr_employees 
join (select emp_no, sum(score) as score
from hr_grade
group by emp_no
order by sum(score) desc
limit 1)a 
on hr_employees.emp_no = a.emp_no
