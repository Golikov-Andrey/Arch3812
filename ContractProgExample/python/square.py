from contract import contract

@contract(precondition=lambda x: x > 0, postcondition=lambda x, y: x == y)
def square(x):
    return x * x

result = square(5)
print(result)  # Output: 25

result = square(-5)  # Raises a PreconditionError