package com.MehndiDesigns2020;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;



public class ImageAdapter  extends  RecyclerView.Adapter<ImageAdapter.ViewHolder>{


    private List<ImageModel> imageslist;
    Context context;
    public ImageAdapter(List<ImageModel> images) {
        this.imageslist = images;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.imagelayoute, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(ImageAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        ImageModel imageModel = imageslist.get(position);

        ImageView imageView = viewHolder.imageView;
        Glide.with(context).load(imageModel.getImageView()).skipMemoryCache(true).into(imageView);

    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return imageslist.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            imageView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    viewTransformation(imageView, event);
                    return true;
                }
            });
        }


        float[] lastEvent = null;
        float d = 0f;
        float newRot = 0f;
        private boolean isZoomAndRotate;
        private boolean isOutSide;
        private static final int NONE = 0;
        private static final int DRAG = 1;
        private static final int ZOOM = 2;
        private int mode = NONE;
        private PointF start = new PointF();
        private PointF mid = new PointF();
        float oldDist = 1f;
        private float xCoOrdinate, yCoOrdinate;
        private void viewTransformation(View view, MotionEvent event) {
            switch (event.getAction() & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_DOWN:
                    xCoOrdinate = view.getX() - event.getRawX();
                    yCoOrdinate = view.getY() - event.getRawY();

                    start.set(event.getX(), event.getY());
                    isOutSide = false;
                    mode = DRAG;
                    lastEvent = null;
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    oldDist = spacing(event);
                    if (oldDist > 10f) {
                        midPoint(mid, event);
                        mode = ZOOM;
                    }

                    lastEvent = new float[4];
                    lastEvent[0] = event.getX(0);
                    lastEvent[1] = event.getX(1);
                    lastEvent[2] = event.getY(0);
                    lastEvent[3] = event.getY(1);

                    break;
                case MotionEvent.ACTION_UP:
                    isZoomAndRotate = false;
                    if (mode == DRAG) {
                        float x = event.getX();
                        float y = event.getY();
                    }
                case MotionEvent.ACTION_OUTSIDE:
                    isOutSide = true;
                    mode = NONE;
                    lastEvent = null;
                case MotionEvent.ACTION_POINTER_UP:
                    mode = NONE;
                    lastEvent = null;
                    break;
                case MotionEvent.ACTION_MOVE:
                    if (!isOutSide) {
                        if (mode == DRAG) {
                            isZoomAndRotate = false;
                            view.animate().x(event.getRawX() + xCoOrdinate).y(event.getRawY() + yCoOrdinate).setDuration(0).start();
                        }
                        if (mode == ZOOM && event.getPointerCount() == 2) {
                            float newDist1 = spacing(event);
                            if (newDist1 > 10f) {
                                float scale = newDist1 / oldDist * view.getScaleX();
                                view.setScaleX(scale);
                                view.setScaleY(scale);
                            }
                            if (lastEvent != null) {

                                view.setRotation((float) (view.getRotation() + (newRot - d)));
                            }
                        }
                    }
                    break;
            }
        }



        private float spacing(MotionEvent event) {
            float x = event.getX(0) - event.getX(1);
            float y = event.getY(0) - event.getY(1);
            return (int) Math.sqrt(x * x + y * y);
        }

        private void midPoint(PointF point, MotionEvent event) {
            float x = event.getX(0) + event.getX(1);
            float y = event.getY(0) + event.getY(1);
            point.set(x / 2, y / 2);
        }

    }
}
