def solution(my_string):
    a = ["a","e","i","o","u"]
    for b in a:
        my_string = my_string.replace(b, "")
    return my_string