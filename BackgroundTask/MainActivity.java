 public void doUpload(View view){
        String str ="btnworks";

        Toast.makeText(getBaseContext(), str, Toast.LENGTH_SHORT).show();

 String lt = "11.222365";
 String lg = "56.999964";
 String type = "insert";
        mode="testInsert";

 BackgroundWorker backgroundWorker = new BackgroundWorker(this);
 backgroundWorker.execute(type, lt, lg,mode);

    }