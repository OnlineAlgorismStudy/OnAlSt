#yard?
#10.1yard = 923.5 cm

n = float(input("yard? "))
def yd_to_cm(yd,conversion=91.44):
  return yd*conversion

print(f"{n}yard =",round(yd_to_cm(10.1),1), "cm")
