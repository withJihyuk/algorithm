-- 코드를 입력하세요
SELECT count(user_id) as users from user_info where age between 20 AND 29 AND joined like '2021%';