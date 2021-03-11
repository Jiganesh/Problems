k,n,w = map(int,input().split())
total=0
while w:
    total +=k*w
    w-=1
print(total-n if (total-n)>0 else 0)
