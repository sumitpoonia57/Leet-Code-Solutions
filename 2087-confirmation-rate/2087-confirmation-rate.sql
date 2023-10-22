# Write your MySQL query statement below
Select  Signups.user_id, round(avg(if( Confirmations.action="confirmed",1,0)),2) as confirmation_rate from  Signups  left outer Join Confirmations  On Confirmations.user_id=Signups.user_id Group by  Signups.user_id ;
