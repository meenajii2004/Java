# import pandas as pd

# data = pd.read_csv('c:/Users/HARSH MEENA/Desktop/Main/Code/Java/Stacks/sales_data.csv')
# data['sales'] = pd.to_numeric(data['sales'], errors='coerce')
# grouped_data = data.groupby('region')['sales'].agg(total_sales='sum', average_sales='mean').reset_index()
# print(grouped_data)

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

df = pd.read_csv('c:/Users/HARSH MEENA/Desktop/Main/Code/Java/Stacks/sales_data.csv')
df['sales'] = pd.to_numeric(df['sales'], errors='coerce')

sns.histplot(df['sales'], bins=30, kde=True)
plt.savefig('histogram.png')
plt.clf()

sns.boxplot(x='region', y='sales', data=df)
plt.savefig('boxplot.png')
plt.clf()
