# SE-Lab-Design-Patterns
تمامی مراحل پیاده‌سازی طبق TDD انجام شده است. به این صورت که ابتدا تست‌ها نوشته شد و سپس پیاده‌سازی صورت گرفت. همچنین ابتدا تست‌های مربوط به state و سپس تست‌های استراتژی نوشته شده است. برای تمامی این موارد UnitTest نوشته شده است و در نهایت برنامه‌ی اصلی Main نوشته شد.

![image](https://github.com/ali-moroukian/SE-Lab-Design-Patterns/assets/45800398/1903d554-9256-4b24-ae1a-8e332586d4be)



طراحی به این صورت است که ابتدا یک initiate state به عنوان state اولیه تعریف می‌شود و سپس طوری طراحی را انجام دادیم که product و state رفرنسی از یکدیگر را داخل خود نگه می‌دارند و هنگامی که داخل product ترنسفر را کال میکنیم، در واقع فانکشن transfer state کال می‌شود و در هر state نیز استیت بعد از transfer یا deliver مشخص خواهد شد.

در مورد استراتژی هم به این صورت است که فرض میکنیم هدف برآورد قیمت است و به این صورت یک interface از استراتژی‌ها داریم و هر بار که نیاز به برآورد قیمت از محصولی شد، بر اساس استراتژی انتخابی قیمت محصول تولید می‌شود.


در Docker، سه مفهوم اساسی وجود دارد که هر کدام وظیفه و نقش خاص خود را دارند: Dockerfile، Image، و Container. در ادامه این سه مفهوم را با یکدیگر مقایسه می‌کنیم:

### Dockerfile
- **وظیفه**: Dockerfile یک فایل متنی است که شامل دستورالعمل‌هایی برای ساخت یک Docker image می‌باشد. این فایل مشخص می‌کند که چه نرم‌افزارها، کتابخانه‌ها، و تنظیماتی باید در image قرار گیرند.
- **محتوا**: Dockerfile شامل دستورات و تنظیماتی مانند FROM (برای مشخص کردن پایه image)، RUN (برای اجرای دستورات در حین ساخت image)، COPY (برای کپی فایل‌ها به image)، و CMD (برای تعیین فرمان پیش‌فرض در زمان اجرای container) می‌باشد.
- **مثال**:
  ```dockerfile
  FROM python:3.8-slim
  WORKDIR /app
  COPY . /app
  RUN pip install -r requirements.txt
  CMD ["python", "app.py"]
  ```

### Image
- **وظیفه**: Image یک بسته‌ای ثابت و قابل حمل است که شامل تمام اطلاعات و نرم‌افزارهای لازم برای اجرای یک برنامه می‌باشد. Image نتیجه نهایی اجرای Dockerfile است.
- **ویژگی‌ها**: Image‌ها لایه‌مند هستند، به این معنی که از چندین لایه ساخته می‌شوند که هر کدام تغییرات خاصی را نسبت به لایه قبلی اعمال می‌کنند. Image‌ها تغییرناپذیر (immutable) هستند و می‌توانند برای ساخت container‌ها استفاده شوند.
- **مثال**: وقتی شما Dockerfile خود را با استفاده از دستور `docker build` اجرا می‌کنید، یک Docker image ساخته می‌شود که می‌تواند به نام خاصی برچسب‌گذاری شود (مثلاً my-python-app:latest).

### Container
- **وظیفه**: Container یک نمونه اجرایی (runtime instance) از یک Docker image است. Container یک محیط ایزوله شده است که برنامه را اجرا می‌کند.
- **ویژگی‌ها**: Container‌ها می‌توانند اجرا، توقف، و حذف شوند بدون اینکه به image اصلی آسیبی برسد. آن‌ها مانند یک فرآیند جداگانه در سیستم عمل می‌کنند که محیط اجرای آن توسط Docker مدیریت می‌شود.
- **مثال**: با استفاده از دستور `docker run`, شما می‌توانید یک container از یک image خاص ایجاد و اجرا کنید:
  ```sh
  docker run -d --name my-python-app-container my-python-app:latest
  ```

### مقایسه وظایف
- **Dockerfile**: وظیفه ایجاد دستورالعمل‌های ساخت image.
- **Image**: وظیفه فراهم کردن یک بسته ثابت و قابل حمل شامل تمامی موارد لازم برای اجرای برنامه.
- **Container**: وظیفه اجرای واقعی برنامه در محیط ایزوله شده بر اساس image.

### نتیجه‌گیری
هر سه مفهوم Dockerfile، Image و Container نقش‌های مکمل دارند. Dockerfile برای تعریف ساختار و محتویات Image استفاده می‌شود، Image نتیجه نهایی از اجرای Dockerfile است که می‌تواند در هر سیستمی اجرا شود، و Container نمونه اجرایی از آن Image است که برنامه را در یک محیط ایزوله شده اجرا می‌کند.



### Project Owner Report
برد کانبان برای پروژه ایجاد شد و تسک‌های زیر به ترتیب آورده شده انجام شدند:


<img width="640" alt="image" src="https://github.com/ali-moroukian/SE-Lab-Design-Patterns/assets/45800398/31b45e7a-b2c3-41da-a07d-d2c045b30c4c">

<img width="640" alt="image" src="https://github.com/ali-moroukian/SE-Lab-Design-Patterns/assets/45800398/2c6b0d12-960a-4805-a7d7-d492ae170a91">

![image](https://github.com/ali-moroukian/SE-Lab-Design-Patterns/assets/45800398/5fad6323-e214-48bc-9399-dc401791f8b0)

![image](https://github.com/ali-moroukian/SE-Lab-Design-Patterns/assets/45800398/41040580-cb06-4e24-bb1c-b46b48e85ac2)
