n = int (input())

while n:
    string = input()
    lenOfString = len(string)
    if lenOfString >10:
        print(string[0]+str(lenOfString-2)+string[lenOfString-1])
    else:
        print(string)
    n-=1