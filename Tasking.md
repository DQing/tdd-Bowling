### 保龄球场景

- 一局中每一轮的两次扔球都没有碰到球，所得分数为0。

- 一局中每一轮的两次扔球都没有全部击倒球瓶，所得分数为每次扔球的倒瓶数总和。
- 一局中存在一轮STRIKE，所得分数为每次扔球的倒瓶数总和再加STRIKE轮后两球的倒瓶数。

- 一局中存在一轮SPARE，所得分数为每次扔球的倒瓶数总和再加SPARE轮后的一球的倒瓶数。

- 一局中十轮均为STRIKE，所得分数300。

### Tasking

- Given 一局中每一轮的两次扔球都没有碰到球 

  When 计算总分 

  Then 分数为0 

- Given 一局中每一轮的两次扔球都没有全部击倒球瓶

  When 计算总分

  Then 分数为每次扔球的倒瓶数总和

- Given 一局中存在一轮STRIKE，其余每轮都没有全部击倒球瓶

  When 计算总分

  Then 分数为每次扔球的倒瓶数总和再加上STRIKE轮后两球的倒瓶数

- Given 一局中存在一轮SPARE，其余每轮都没有全部击倒球瓶

  When 计算总分

  Then 分数为每次扔球的倒瓶数总和再加上SPARE轮后一球的倒瓶数

- Given 一局中十轮均为STRIKE

  When 计算总分

  Then 分数为300