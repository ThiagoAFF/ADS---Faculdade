from datetime import datetime

hoje = datetime.now()

print(f'data: {hoje:%d/%m/%y}')
print(f'horário: {hoje:%H:%M:%S %p}')