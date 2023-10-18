# Write your MySQL query statement below

Select Substr(trans_date,1,7) as month,country,count(id) as trans_count, Sum(case when state='approved' then 1 else 0 End) as approved_count,Sum(amount) as trans_total_amount,Sum(case when state='approved' then amount else 0 End) as approved_total_amount from Transactions Group by month,country
