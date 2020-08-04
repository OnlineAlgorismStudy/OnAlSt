nums = input("Enter width and length: ").split(" ")
parsed = list(map(int, nums))
# OR parsed = [int(num) for num in nums]
width = parsed[0] + 5
length = parsed[1] * 2

print(f'width = {width}\nlength = {length}\narea = {width*length}')

