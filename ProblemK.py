n = int(input())
str = input()
count=0

for i in range(1,n):
    if str[i-1]==str[i]:
        count+=1;
print(count)