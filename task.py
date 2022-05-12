def converter(x: int, num: int) -> int:
    assert num > 0
    assert x == 1 or x == 0
    if x == 1 :
        res1 = num / 73
        res2 = num / 89
        print ("In dollars, it is ", res1)
    elif x == 0 :
        res1 = num / 73
        res2 = num / 89
        print ("In euro, it is ", res2)

converter(1, 100)
