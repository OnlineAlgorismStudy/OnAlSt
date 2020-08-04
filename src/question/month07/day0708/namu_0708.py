cities = ["Seoul", "Washington", "Tokyo", "Beijing"]
while True:
    print("1. Korea\n2. USA\n3. Japan\n4. China")
    num = int(input("number? "))
    if num not in range(1,5):
        print("\nnone")
        break
    print(f"\n{cities[num-1]}\n")
